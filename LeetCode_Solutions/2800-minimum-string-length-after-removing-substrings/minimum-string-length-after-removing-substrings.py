class Solution:
    def minLength(self, s: str) -> int:
        st = []  # Use list as a stack
        for char in s:
            if not st:  # If the stack is empty
                st.append(char)
            else:
                if char == 'B':
                    if st[-1] == 'A':  # Check the top of the stack
                        st.pop()  # Pop the top of the stack
                    else:
                        st.append(char)  # Push the current character
                elif char == 'D':
                    if st[-1] == 'C':  # Check the top of the stack
                        st.pop()  # Pop the top of the stack
                    else:
                        st.append(char)  # Push the current character
                else:
                    st.append(char)  # Push the current character
        
        return len(st)  # Return the size of the stack
