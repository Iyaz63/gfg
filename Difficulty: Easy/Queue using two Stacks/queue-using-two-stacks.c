//{ Driver Code Starts
//Initial Template for C
#include <stdio.h>
#include <stdlib.h>

/* structure of a stack node */
struct sNode {
	int data;
	struct sNode* next;
};


// } Driver Code Ends

// User function Template for C

/* Function to push an item to stack*/
void push(struct sNode** top_ref, int new_data) {
    struct sNode* new_node = (struct sNode*)malloc(sizeof(struct sNode));
    if (!new_node) {
        printf("Stack overflow\n");
        exit(1);
    }
    new_node->data = new_data;
    new_node->next = *top_ref;
    *top_ref = new_node;
}

/* Function to pop an item from stack*/
int pop(struct sNode** top_ref) {
    if (*top_ref == NULL) {
        printf("Stack underflow\n");
        return -1; // Or exit(1);
    }
    struct sNode* temp = *top_ref;
    int popped = temp->data;
    *top_ref = temp->next;
    free(temp);
    return popped;
}


//{ Driver Code Starts.

/* structure of queue having two stacks */
struct queue {
	struct sNode* stack1;
	struct sNode* stack2;
};

/* Function to enqueue an item to queue */
void enQueue(struct queue* q, int x)
{
	push(&q->stack1, x);
}

/* Function to deQueue an item from queue */
int deQueue(struct queue* q)
{
	int x;

	/* If both stacks are empty then error */
	if (q->stack1 == NULL && q->stack2 == NULL) {
		return -1;
	}

	/* Move elements from stack1 to stack 2 only if
	stack2 is empty */
	if (q->stack2 == NULL) {
		while (q->stack1 != NULL) {
			x = pop(&q->stack1);
			push(&q->stack2, x);
		}
	}

	x = pop(&q->stack2);
	return x;
}


/* Driver function to test anove functions */
int main()
{ 
    int T;
    scanf("%d",&T);
    while(T--){
	struct queue* q = (struct queue*)malloc(sizeof(struct queue));
	q->stack1 = NULL;
	q->stack2 = NULL;
	int Q;
    scanf("%d",&Q);
    while(Q--){
    int QueryType=0;
    scanf("%d",&QueryType);
    if(QueryType==1)
    {
        int a;
        scanf("%d",&a);
        enQueue(q, a);
    }else if(QueryType==2){
        printf("%d ",deQueue(q));
        
        }
    }
	printf("\n");

printf("~%s", "\n");}
return 0;
}

// } Driver Code Ends