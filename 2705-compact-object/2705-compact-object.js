/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
     const compactObj = Array.isArray(obj) ? [] : {};
    for(const key in obj) {
        let elem = obj[key];
        if(elem) {
            if(typeof elem === "object") elem = compactObject(elem);
            Array.isArray(obj) ? compactObj.push(elem) : compactObj[key] = elem;
        }
    }
    return compactObj;
};