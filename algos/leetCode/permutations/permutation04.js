const permute = (nums, set = [], answer = []) => {
    if (!nums.length) answer.push([...set]);

    for (let i = 0; i < nums.length; i++) {
        const newNums = nums.filter((n, index) => index !== i);

        set.push(nums[i]);

        permute(newNums, set, answer);

        set.pop();
    }

    return answer;
};

const inputNums = [1, 2, 3];

console.log(permute(inputNums));
