package solution;

public class FloodFillSolution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int oldColor = image[sr][sc];

        fun(image, sr, sc, newColor, oldColor);

        return image;
    }

    private void fun(int[][] image, int sr, int sc, int newColor, int oldColor) {
        if (sr < 0 || sc < 0) {
            return;
        }

        if (sr >= image.length || sc >= image[0].length) {
            return;
        }
        if (oldColor == newColor) {
            return;
        }
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;

            fun(image, sr + 1, sc, newColor, oldColor);
            fun(image, sr - 1, sc, newColor, oldColor);
            fun(image, sr, sc + 1, newColor, oldColor);
            fun(image, sr, sc - 1, newColor, oldColor);

        }
    }

    public static void main(String[] args) {

    }
}
