# LocalMinima

# Algorithm
Start with an array arr of size n.

Iterate through the array from index 1 to n-1.

For each element at index i:

Check if the element is smaller than its adjacent elements, arr[i-1] and arr[i+1].

If it is smaller, return the element as the local minimum.

If no local minimum is found during the iteration, return -1 to indicate that there is no local minimum in the array.

The algorithm has a time complexity of O(n), as it iterates through the array once, checking each element's relationship with its adjacent elements.
