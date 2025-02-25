function mergeSort(arr) {
    if (arr.length <= 1) return arr; 

    let mid = Math.floor(arr.length / 2);
    let left = mergeSort(arr.slice(0, mid));
    let right = mergeSort(arr.slice(mid));

    return merge(left, right);
}

function merge(left, right) {
    let result = [], i = 0, j = 0;

    // Merge elements in sorted order
    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            result.push(left[i++]);
        } else {
            result.push(right[j++]);
        }
    }

    // Append remaining elements (if any)
    return result.concat(left.slice(i)).concat(right.slice(j));
}

// Example usage
let arr = [12, 11, 13, 5, 6, 7];
console.log(mergeSort(arr)); // [5, 6, 7, 11, 12, 13]
