const permutation = (elements) => {
    if (elements.length === 0) {
        return [[]];
    }

    const firstElement = elements[0];
    const rest = elements.slice(1);

    const permWithoutFirst = permutation(rest); // start recursion

    // 'allPermutations' will start with an empty array
    const allPermutations = [];

    permWithoutFirst.forEach((perm) => {
        for (let i = 0; i <= perm.length; i++) {
            // insert the first element into index 'i'
            const permWithFirst = [
                ...perm.slice(0, i),
                firstElement,
                ...perm.slice(i),
            ];

            // add 'permEithFirst' into 'allPermutations'
            allPermutations.push(permWithFirst);
        }
    });

    return allPermutations;
};

const testArr = ["a", "b", "c"];
console.log(permutation(testArr));
