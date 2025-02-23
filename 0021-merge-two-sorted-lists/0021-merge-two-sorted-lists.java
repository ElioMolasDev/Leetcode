/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy; // Puntero para construir la lista fusionada

        // Recorrer ambas listas mientras no sean nulas
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // Si el valor de list1 es menor o igual, añadirlo a la lista fusionada
                current.next = list1;
                list1 = list1.next; // Avanzar en list1
            } else {
                // Si el valor de list2 es menor, añadirlo a la lista fusionada
                current.next = list2;
                list2 = list2.next; // Avanzar en list2
            }
            current = current.next; // Mover el puntero al último nodo añadido
        }

        // Si una de las listas aún tiene elementos, añadirlos al final
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // La lista fusionada comienza después del nodo ficticio
        return dummy.next;
    }
}