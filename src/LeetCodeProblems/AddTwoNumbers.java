package LeetCodeProblems;

public class AddTwoNumbers {

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if (l1 == null && l2 == null){
            return l1;
        }
        else if (l1 == null){
            return l2;
        }
        else if (l2 == null){
            return l1;
        }
        
        int sum = 0;
        int carry = 0;
        
        ListNode node = new ListNode(0);
        ListNode temp = node;
        
        while(l1 != null || l2 != null){
            sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            if(sum > 9){
                carry = sum/10;
                sum = sum % 10;
            }
            else{
                carry = 0;
            }
            
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        
        if(carry != 0){
            temp.next = new ListNode(carry);
        }
        
        return node.next;
    }
}
