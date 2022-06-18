class Solution {
    public int trap(int[] height) {
        
        int leftBarsMax[]=new int[height.length]; //Prefix
        int rightBarsMax[]=new int[height.length]; //Suffix
        leftBarsMax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            leftBarsMax[i]=Math.max(leftBarsMax[i-1],height[i]);
        }
        rightBarsMax[rightBarsMax.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightBarsMax[i]=Math.max(rightBarsMax[i+1], height[i]);
        }
        int amountOfWater=0;
        for(int i=0;i<height.length;i++){
            int currentPillar=height[i];
            int barMinHeight=Math.min(leftBarsMax[i],rightBarsMax[i]);
            if(barMinHeight>currentPillar)
            {
                amountOfWater+=barMinHeight-currentPillar;
            }
        }
        return amountOfWater;
    }
}