public class SequentialSearchSTtest{
    public static void main(String[] args) {
        SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();

        st.put("yang", 6);
        st.put("pema", 3);
        st.put("sangay", 7);
        st.put("yang", 2);
        st.put("tashi", 4);
        st.put("yang", 5);

        st.delete("pema");

        assert(st.size() == 3);
        assert(st.get("sangay") == 7);
        assert(st.isEmpty() == false);
        assert(st.contains("pema") == false);

        System.out.println("All Test Cases Passed!");
    }
}