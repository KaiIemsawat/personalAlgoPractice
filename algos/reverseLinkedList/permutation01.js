let nums = [1, 2, 3, 4];

const permute = (numArr) => {
    const output = [];
    const swapIndices = (arr, indexA, indexB) => {
        const temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    };

    const generate = (arrLength, heapArr) => {
        if (arrLength === 1) {
            output.push(heapArr.slice());
            return;
        }

        generate(arrLength - 1, heapArr);

        for (let i = 0; i < arrLength - 1; i++) {
            if (arrLength % 2 === 0) {
                swapIndices(heapArr, i, arrLength - 1);
            } else {
                swapIndices(heapArr, 0, arrLength - 1);
            }

            generate(arrLength - 1, heapArr);
        }
    };

    generate(numArr.length, numArr.slice());
    return output;
};

console.log(permute(nums));
