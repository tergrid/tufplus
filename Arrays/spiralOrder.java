import java.util.ArrayList;

class spiralOrder {
  public ArrayList<Integer> spiralOrderFn(int[][] matrix) {
    ArrayList<Integer> list = new ArrayList<>();
    int n = matrix.length;
    int m = matrix[0].length;

    int top = 0, left = 0;
    int bottom = n - 1, right = m - 1;

    while (top <= bottom && left <= right) {
      // traverse left -> right
      for (int i = left; i <= right; ++i) {
        list.add(matrix[top][i]);
      }
      top++;
      // traverse top -> bottom
      for (int i = top; i <= bottom; ++i) {
        list.add(matrix[i][right]);
      }
      right--;
      // traverse bottom -> left
      if (top <= bottom) {
        for (int i = right; i >= left; --i) {
          list.add(matrix[bottom][i]);
        }
        bottom--;
      }
      // traverse from bottom to top
      if (left <= right) {
        for (int i = bottom; i >= top; --i) {
          list.add(matrix[i][left]);
        }
        left++;
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int[][] mat = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
    };
    spiralOrder so = new spiralOrder();
    ArrayList<Integer> ansList = so.spiralOrderFn(mat);
    System.out.println("Elements in spiral order are: ");

    for (int i = 0; i < ansList.size(); ++i) {
      System.out.println(ansList.get(i) + " ");
    }
    System.out.println();
  }
}
