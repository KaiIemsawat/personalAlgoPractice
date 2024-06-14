const permute = (numsArr, set = [], answer = []) => {
    if (!numsArr.length) {
        answer.push([...set]);
        console.log("answer after push", answer);
    }

    for (let i = 0; i < numsArr.length; i++) {
        console.log("i : ", i);
        // numsArr will always remain the same

        const newNumsArr = numsArr.filter((_, index) => index !== i);
        console.log("newNumsArr after .filter()", newNumsArr);

        set.push(numsArr[i]);
        console.log("Set after .push()", set);

        console.log("calling permute");
        permute(newNumsArr, set, answer);
        // When permute() is called with empty array. It also means that the argument array length is 0.
        // Which means, 1. no for loop since i = argumentArray.length. 2. answer will push [...set]

        // After finish the lowest layer of recursion, the progress will continue here
        set.pop();
        console.log("Set after .pop()", set);

        console.log("============ for loop end ============");
    }

    return answer;
};

let numArr = [1, 2, 3];

console.log("RESULT :: ", permute(numArr));
