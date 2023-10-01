#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//  STACKS (for characters)
#define MAXLEN 100

typedef struct
{
    char element[MAXLEN];
    int top;
} stack;

stack init()
{
    stack S;
    S.top = -1;
    return S;
}

int isEmpty(stack S)
{
    return (S.top == -1);
}

int isFull(stack S)
{
    return (S.top == MAXLEN - 1);
}

char top(stack S)
{
    if (isEmpty(S))
    {
        printf("top: Empty stack\n");
        return '\0';
    }
    return S.element[S.top];
}

stack push(stack S, char ch) // return type is stack
{
    if (isFull(S))
    {
        printf("push: Full stack\n");
        return S;
    }
    ++S.top;
    S.element[S.top] = ch;
    return S;
}

stack pop(stack S) // return type is stack
{
    if (isEmpty(S))
    {
        printf("pop: Empty stack");
        return S;
    }
    --S.top;
    return S;
}

void print(stack S) // prints contents of stack
{
    int i;
    for (i = S.top; i >= 0; --i)
        printf("%c", S.element[i]);
}

//  QUEUES
#define MAXLEN 100

typedef struct
{
    char element[MAXLEN];
    int front;
    int back;
} queue;

queue init()
{
    queue Q;
    Q.front = 0;
    Q.back = MAXLEN - 1;
    return Q;
}

int isEmpty(queue Q)
{
    if (Q.front == (Q.back + 1) % MAXLEN)
        return 1;
    else
        return 0;
}

int isFull(queue Q)
{
    if (Q.front == (Q.back + 2) % MAXLEN)
        return 1;
    else
        return 0;
}

char front(queue Q)
{
    if (isEmpty(Q))
    {
        printf("front: empty Queue");
        return '\0';
    }
    return Q.element[Q.front];
}

queue enqueue(queue Q, char ch)
{
    if (isFull(Q))
    {
        printf("enqueue: Queue is full\n");
        return Q;
    }
    ++Q.back;
    if (Q.back == MAXLEN)
        Q.back = 0;
    Q.element[Q.back] = ch;
    return Q;
}

queue dequeue(queue Q)
{
    if (isEmpty(Q))
    {
        printf("dequeue: empty Queue\n");
        return Q;
    }
    ++Q.front;
    if (Q.front == MAXLEN)
        Q.front = 0;
    return Q;
}

void print(queue Q)
{
    int i;
    if (isEmpty(Q))
        return;
    i = Q.front;
    while (1)
    {
        printf("%c", Q.element[i]);
        if (i == Q.back)
            break;
        if (++i == MAXLEN)
            i = 0;
    }
}

// LINKED LIST
struct list
{
    int d;
    struct list *next;
};
typedef struct list ELEMENT;
typedef ELEMENT *LINK;

int main()
{
    //use of linked list and memory allocation
    LINK head;
    head = (LINK)malloc(sizeof(ELEMENT));
    head->d = 50;
    head->next = NULL;
}