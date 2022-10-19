public class DynamicArrays {
    public static void main(String[] args) {
        AdvancedArrays advancedArrays = new AdvancedArrays();
        advancedArrays.createArray(20);
        advancedArrays.setArray(new int[]{1,2,3,4,5});
        advancedArrays.add(1);
        advancedArrays.remove(5);
        advancedArrays.printArray();
        advancedArrays.get(5);
        advancedArrays.size();
    }

}
