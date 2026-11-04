var minOperations = function (nums, x, k) {
    const n = nums.length;
    const vals = [...new Set(nums)].sort((a, b) => a - b);
    const m = vals.length;
    const idx = new Map();
    vals.forEach((v, i) => idx.set(v, i + 1));
    const rk = nums.map(v => idx.get(v));

    const bc = new Float64Array(m + 1);
    const bs = new Float64Array(m + 1);
    const cntAt = new Int32Array(m + 1);
    let LOG = 0;
    while ((1 << (LOG + 1)) <= m) LOG++;
    const need = Math.floor((x + 1) / 2);

    const upd = (i, c, v) => {
        for (; i <= m; i += i & -i) { bc[i] += c; bs[i] += v; }
    };

    let tot = 0;
    for (let i = 0; i < x; i++) {
        upd(rk[i], 1, nums[i]); cntAt[rk[i]]++; tot += nums[i];
    }

    const cost = new Float64Array(n - x + 1);
    for (let s = 0; s + x <= n; s++) {
        let pos = 0, kk = need, accC = 0, accS = 0;
        for (let b = LOG; b >= 0; b--) {
            const np = pos + (1 << b);
            if (np <= m && bc[np] < kk) {
                pos = np; kk -= bc[np]; accC += bc[np]; accS += bs[np];
            }
        }
        const p = pos + 1;
        const med = vals[p - 1];
        const cntLE = accC + cntAt[p];
        const sumLE = accS + cntAt[p] * med;
        cost[s] = med * cntLE - sumLE + (tot - sumLE) - med * (x - cntLE);

        upd(rk[s], -1, -nums[s]); cntAt[rk[s]]--; tot -= nums[s];
        if (s + x < n) {
            upd(rk[s + x], 1, nums[s + x]); cntAt[rk[s + x]]++; tot += nums[s + x];
        }
    }

    let prev = new Float64Array(n + 1);
    for (let j = 1; j <= k; j++) {
        const cur = new Float64Array(n + 1).fill(Infinity);
        for (let i = x; i <= n; i++) {
            cur[i] = Math.min(cur[i - 1], prev[i - x] + cost[i - x]);
        }
        prev = cur;
    }
    return prev[n];
};