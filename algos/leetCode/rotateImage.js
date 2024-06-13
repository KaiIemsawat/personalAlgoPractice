const swap = (matrix, i, j, k, l) => {
    const temp = matrix[k][l];
    matrix[k][l] = matrix[i][j];
    matrix[i][j] = temp;
};

var rotate = function (matrix) {
    let lo = 0;
    let hi = matrix.length - 1;

    while (lo < hi) {
        const length = hi - lo;

        for (let i = 0; i < length; i++) {
            const index = lo + i;

            swap(matrix, lo + i, hi, lo, index);
            swap(matrix, hi, hi - i, lo, index);
            swap(matrix, hi - i, lo, lo, index);
        }
        lo++;
        hi--;
    }

    return matrix;
};

const testArr = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
    [13, 14, 15, 16],
];

console.log(rotate(testArr));
