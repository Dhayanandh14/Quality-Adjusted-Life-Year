
N=gets.to_i;
tot=0
N.times{ |i|
  q,l=gets.chomp.split.map(&:to_f)
  tot = q*l+tot;
}
  print(tot)
