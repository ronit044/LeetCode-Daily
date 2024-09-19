// Method to generate legal expressions recursively
class Solution{
public void generateLegalExpressions(char[] arr, int ind, String exp) {
    if (ind >= arr.length) {
        System.out.println(exp + ")");
        return;
    }
        exp += "(" + arr[ind];
    
    generateLegalExpressions(arr, ind + 1, exp);
    
    exp += ")";
        generateLegalExpressions(arr, ind + 1, exp);
}

public List<Integer> diffWaysToCompute(String expression) {
    List<Integer> result = new ArrayList<>();
    
    // Iterate over the characters in the expression
    for (int i = 0; i < expression.length(); i++) {
        char c = expression.charAt(i);
        
        // If the current character is an operator
        if (c == '+' || c == '-' || c == '*') {
            List<Integer> left = diffWaysToCompute(expression.substring(0, i));
            List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
            for (int l : left) {
                for (int r : right) {
                    if (c == '+') result.add(l + r);
                    else if (c == '-') result.add(l - r);
                    else if (c == '*') result.add(l * r);
                }
            }
        }
    }
        if (result.isEmpty()) result.add(Integer.parseInt(expression));
    return result;
}

}