import pandas as pd

# Define the data as a dictionary
data = {
    'Name': ['Alice', 'Bob', 'Charlie'],
    'Age': [25, 30, 35],
    'Role': ['Engineer', 'Designer', 'Manager']
}

# Create the DataFrame (table)
df = pd.DataFrame(data)

# Display the table
print(df)
