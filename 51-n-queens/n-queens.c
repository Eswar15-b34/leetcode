
#include <stdlib.h>
#include <string.h>

char ***ans;
int count;
int n;

int safe(char **board, int r, int c)
{
    int i, j;

    // Check same column
    for(i = 0; i < r; i++)
        if(board[i][c] == 'Q')
            return 0;

    // Check left diagonal
    for(i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--)
        if(board[i][j] == 'Q')
            return 0;

    // Check right diagonal
    for(i = r-1, j = c+1; i >= 0 && j < n; i--, j++)
        if(board[i][j] == 'Q')
            return 0;

    return 1;
}

void solve(char **board, int r, int *returnColumnSizes)
{
    int c;

    // Base condition: All queens are placed
    if(r == n)
    {
        ans = realloc(ans, (count + 1) * sizeof(char **));

        ans[count] = malloc(n * sizeof(char *));

        for(int i = 0; i < n; i++)
        {
            ans[count][i] = malloc((n + 1) * sizeof(char));
            strcpy(ans[count][i], board[i]);
        }

        returnColumnSizes[count] = n;
        count++;

        return;
    }

    // Try every column
    for(c = 0; c < n; c++)
    {
        if(safe(board, r, c))
        {
            board[r][c] = 'Q';

            // Recursive call
            solve(board, r + 1, returnColumnSizes);

            // Backtracking
            board[r][c] = '.';
        }
    }
}

char*** solveNQueens(int size, int* returnSize, int** returnColumnSizes)
{
    int i;

    n = size;
    count = 0;
    ans = NULL;

    // Create chessboard
    char **board = malloc(n * sizeof(char *));

    for(i = 0; i < n; i++)
    {
        board[i] = malloc((n + 1) * sizeof(char));
        memset(board[i], '.', n);
        board[i][n] = '\0';
    }

    // Allocate column sizes
    *returnColumnSizes = malloc(1000 * sizeof(int));

    // Start recursion
    solve(board, 0, *returnColumnSizes);

    // Return total solutions
    *returnSize = count;

    // Free temporary board
    for(i = 0; i < n; i++)
        free(board[i]);

    free(board);

    return ans;
}
