class ProductOfNumbers {
        private List<Integer> nums;       
        private List<Integer> products;  

        public ProductOfNumbers() {
            nums = new ArrayList<>();
            products = new ArrayList<>();
            products.add(1); 
        }

    public void add(int num) {
        nums.add(num);
        if (num == 0) {
            products = new ArrayList<>();
            products.add(1);
        } else {
            products.add(products.get(products.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int n = products.size();
        if (k >= n) {
            return 0;
        }
        return products.get(n - 1) / products.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */