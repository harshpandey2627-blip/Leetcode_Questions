/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let harsh;
    let sameer = false;
    return function(...args){
        if(!sameer){
            harsh = fn(...args);
            sameer  = true;
            return harsh;
        }
        
    };
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
