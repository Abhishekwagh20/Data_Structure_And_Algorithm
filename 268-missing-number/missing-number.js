/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    var sum = n*(n+1) / 2;

    for(let i = 0; i <nums.length; i++){
        sum -= nums[i];
    }
    return sum;
};