/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let harsh=[]
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            harsh.push(arr[i]);
        }
    }
    return harsh;
};