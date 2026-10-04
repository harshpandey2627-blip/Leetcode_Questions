/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let harsh = init;
    for(let i=0;i<nums.length;i++){
     harsh =fn(harsh,nums[i]);
    }
    return harsh;
};