let obj1 = {
  names: ['id', 'type', 'color', 'count'],
  data: [
    {
      id: 123,
      type: 'foo',
      color: 0xffffff,
      count: 45
    },
    {
      id: '234',
      'type': 'bar',
      color: 'red',
      count: '75'
    },
    {
      id: '123cfe',
      type: 'baz',
      colour: 'blue',
      cout: 123
    }
  ]
}

// Extract array 'data' from object 'obj1' and output the fields in a table form
// In each sub array of array 'data' sum the last value of the array and output
// Add a row at the beginning of the output with the entries from the array 'names'

// Create a set of nested arrays to contain the data which looks like:
/*
[
  ['id', 'type', 'color', 'count'],
  [123, 'foo', 0xffffff, 45],
  ...
]
*/
