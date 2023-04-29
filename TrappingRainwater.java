public class rainwaterary {
    public static int TrappingRainWater(int height[]){
        int n = height.length;

        //calculate left-max boundary - in form of an array (we can call them auxiliary array or helper array)
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate left-max boundary - in form of an array (we can call them auxiliary array or helper array)
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n -2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop
        int TrappedWater = 0;
        for (int i = 0; i < n; i++){
            //waterLevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //TrappedWater = waterLevel - height[i]
            TrappedWater += waterLevel - height[i];
        }
        return TrappedWater;


    }
    public static void main(String ags[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappingRainWater(height));
    }
}
