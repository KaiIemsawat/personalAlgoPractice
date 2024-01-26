const permute = (numsArr, set = [], answer = []) => {
    if (!numsArr.length) {
        answer.push([...set]);
    }

    for (let i = 0; i < numsArr.length; i++) {
        const newNumsArr = numsArr.filter((_, index) => index !== i);
        set.push(numsArr[i]);

        permute(newNumsArr, set, answer);
        set.pop();
    }

    return answer;
};

let numArr = [1, 2, 3];

console.log(permute(numArr));
