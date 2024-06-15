// Helper functions
const dFS = (i, j, grid, visited) => {
    const stack = [[i, j]];
    let islandSize = 0;

    while (stack.length) {
        let currentNode = stack.pop();

        let [i, j] = currentNode;

        // Check if visited at i and j;
        if (visited[i][j]) {
            continue;
        }
        visited[i][j] = true;

        // Check if cell is part of an island
        if (grid[i][j] === "0") {
            continue;
        }
        islandSize++;

        let adjNeighbors = getAdhNeighbor(i, j, grid, visited);

        stack.push(...adjNeighbors);
    }
    return islandSize > 0 ? true : false;
};

const getAdhNeighbor = (i, j, grid, visited) => {
    const adjNeighbors = [];

    // Check if validating on second row and above AND not visited
    if (i > 0 && !visited[i - 1][j]) {
        adjNeighbors.push([i - 1, j]);
    }
    // Check if the index below (below in term of grid image)
    if (i < grid.length - 1 && !visited[i + 1][j]) {
        adjNeighbors.push([i + 1, j]);
    }

    if (j > 0 && !visited[i][j - 1]) {
        adjNeighbors.push([i, j - 1]);
    }
    if (j < grid[0].length - 1 && !visited[i][j + 1]) {
        adjNeighbors.push([i, j + 1]);
    }

    return adjNeighbors;
};

// Main function
var numIsland = function (grid) {
    const visited = grid.map((row) => row.map((cell) => false));
    let islandCount = 0;

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[i].length; j++) {
            if (dFS(i, j, grid, visited)) {
                islandCount++;
            }
        }
    }

    return islandCount;
};

const inputArr = [
    ["1", "0", "1", "1", "1", "0"],
    ["1", "1", "1", "1", "0", "0"],
    ["0", "1", "0", "0", "1", "0"],
    ["1", "1", "1", "1", "1", "0"],
];

console.log(numIsland(inputArr));
