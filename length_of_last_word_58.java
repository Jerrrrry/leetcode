public int lengthOdLastWord(String s){
  if(s==null) return 0;
  s=s.trim();
  if(s.length()==0) return 0;
  String[] words=s.split(" ");
  return words[words.length-1].length();
}
