/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const harsh =[];
    for(let i = 0;i<arr.length;i++){
        harsh.push(fn(arr[i],i));
    }
    return harsh;

};