const isValid = (str) => {
    const stack = [];
    const parens = "() {} []";

    let i = 0;

    while (i < str.length) {
        stack.push(str[i]);
        i++;

        let open = stack[stack.length - 2];
        let close = stack[stack.length - 1];

        // console.log("open : ", open);
        // console.log("close : ", close);

        let potentialParens = open + close;
        console.log("potentialParens : ", potentialParens);

        if (parens.includes(potentialParens)) {
            stack.pop();
            // console.log("stack pop 1 :: ", stack);
            stack.pop();
            // console.log("stack pop 2 :: ", stack);
        }
        // console.log("stack", stack);
    }

    return stack.length === 0;
};

let input = "((({[]}))){}";

console.log("\n- isValid :: ", isValid(input));
