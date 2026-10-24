class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(){};
        ListNode currentR = result;
        int remainder = 0;
        int carry = 0;
        //keeps going while either list has nodes or there is carry left
        while(l1 != null || l2 != null || carry != 0){
            int num1 = 0;
            int num2 = 0;
            //check that the nodes exist
            if(l1 != null){
                num1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                num2 = l2.val;
                l2 = l2.next;
            }
            int sum = num1 + num2 + carry;
            //a sum of 10 or greater needs a carry
            if(sum >= 10){
                //keep the rightmost digit
                remainder = sum%10;
                //the highest sum is 19, so the carry is 1
                carry = 1;
            }else{
                remainder = sum;
                // the sum is less than 10 so the carry is 0
                carry = 0;
            }
            //attach a new node
            currentR.next = new ListNode(remainder);
            //move to the node we just added
            currentR = currentR.next;
        }
        return result.next; 
    }
}