const permute = (numsArr, set = [], answer = []) => {
    if (!numsArr.length) {
        answer.push([...set]);
    }

    for (let i = 0; i < numsArr.length; i++) {
        const newNumsArr = numsArr.filter((_, index) => index !== i);
        set.push(numsArr[i]);
        // console.log("PUSH", set);

        permute(newNumsArr, set, answer);
        set.pop();
        // console.log("POP", set);
    }

    // console.log("ANSWER", answer);
    return answer;
};

let numArr = [1, 2, 3];

console.log(permute(numArr));
