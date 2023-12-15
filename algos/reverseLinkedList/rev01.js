let originalList = ["1", true, [1, 2, 3], 4];
const reversList = (list) => {
    let rev = [];
    if (list.length === 1) return list;
    for (let i = list.length - 1; i >= 0; i--) {
        rev.push(list[i]);
    }
    return rev;
};

console.log(reversList(originalList));
