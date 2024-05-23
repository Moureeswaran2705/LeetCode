class Solution:
  def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    dict = collections.defaultdict(list)
    #print(dict)
    # for key,values in dict.items():
        #  print(f'{key}: {values}')
    for str in strs:
      key = ''.join(sorted(str))
      dict[key].append(str)

    return dict.values()