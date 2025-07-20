public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // visit
        if (image[sr][sc] == color) {
            return image;
        }
        helper(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void helper(int[][] image, int r, int c, int old, int color) {
        if (r < 0 || c < 0 ||
                image.length <= r ||
                image[0].length <= c) {
            return;
        }
        if (image[r][c] != old) {
            return;
        } else {
            image[r][c] = color;
        }

        helper(image, r + 1, c, old, color);
        helper(image, r - 1, c, old, color);
        helper(image, r, c + 1, old, color);
        helper(image, r, c - 1, old, color);
    }
}
