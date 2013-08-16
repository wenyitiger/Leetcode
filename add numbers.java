public class Solution {
     
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int v;
         int ten = 0;
         if ((l1.val+l2.val)>=10) ten = 1;
        if(ten==1){ v= l1.val+l2.val-10;}
        else { v = l1.val+l2.val;}
        
        ListNode l3 = new ListNode(v);
        ListNode l4 = l3;
         
        while(l1.next!=null||l2.next!=null)
        {
          
            if(l1.next ==null){
                if(ten ==1) {
                 if (l2.next.val+1==10){
                     l3.next = new ListNode(0);
                 }else{
                l3.next = new ListNode(l2.next.val+1);
               ten = 0;
                 }
               
                }else
                {
                l3.next = new ListNode(l2.next.val);    
                ten = 0;    
                }
                l2 = l2.next;
                l3 = l3.next;
            }
            else if(l2.next ==null){
                if(ten ==1) {
                
               if (l1.next.val+1==10){
                     l3.next = new ListNode(0);
                 }else{
                l3.next = new ListNode(l1.next.val+1);
                ten = 0;
                 }
               
                }else
                {
                l3.next = new ListNode(l1.next.val);    
                ten = 0;    
                }
                l1 = l1.next;
                l3 = l3.next;
            }else{
                 if(ten ==1) {
                if (l1.next.val+l2.next.val+1>=10) {
                l3.next = new ListNode(l1.next.val+l2.next.val-9);
                }
                else { 
                    l3.next = new ListNode(l1.next.val+l2.next.val+1);
                    ten = 0;
                }
                }else
                {
               if (l1.next.val+l2.next.val>=10) {
                l3.next = new ListNode(l1.next.val+l2.next.val-10);
                ten = 1;
                }
                else { 
                    l3.next = new ListNode(l1.next.val+l2.next.val);                    
                }
                }
                l1= l1.next;
                l2= l2.next;
                l3 = l3.next;
                
                
                
                
            }
          
            
            
            
        }
        if (ten==1) {
        
        
        l3.next = new ListNode(1);
        }
        return l4;
    }
    
   
    
}