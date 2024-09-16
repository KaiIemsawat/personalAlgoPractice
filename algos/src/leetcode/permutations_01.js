const permutations = (elements) => {
    if (elements.length === 0) return [[]];

    const firstElement = elements[0];
    const rest = elements.slice(1);

    const permWithoutFirst = permutations(rest);

    const allPermutations = [];
    permWithoutFirst.forEach((perm) => {
        for (let i = 0; i <= perm.length; i++) {
            const permWithFirst = [
                ...perm.slice(0, i),
                firstElement,
                ...perm.slice(i),
            ];
            allPermutations.push(permWithFirst);
        }
    });

    return allPermutations;
};

console.log(permutations(["a", "b", "c"]));
