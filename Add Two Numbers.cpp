// Question:
// Add Two Numbers

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Example 1:
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

// Example 2:
// Input: l1 = [0], l2 = [0]
// Output: [0]

// Example 3:
// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]

Solution:
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* head=new ListNode();
        ListNode* dummyHead=head;
        int carry=0,d1,d2,sum=0,digit=0,c=0;
        while(l1!=NULL || l2!=NULL || carry!=0){
            d1= l1!=NULL ? l1->val : NULL;
            d2= l2!=NULL ? l2->val : NULL;
            sum=d1+d2+carry;
            carry=sum/10;
            digit=sum%10;

            ListNode* x=new ListNode(digit);
            dummyHead->next=x;
            dummyHead=dummyHead->next;

            l1=(l1!=NULL) ? l1->next:NULL;
            l2=(l2!=NULL) ? l2->next:NULL;
            c++;
        }
        return head->next;
    }
};
