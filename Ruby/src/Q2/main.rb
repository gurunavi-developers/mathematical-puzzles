from = 1000
to = 9999

operators = ['*', ''].repeated_permutation(3).to_a
operators.delete(['', '', ''])

answers = (from..to).select do |n|
  chars = n.to_s.chars
  operators.any? do |op|
    r = 0
    expr =  chars.zip(op).flatten.join('').gsub(/0+(\d)/) { $1 }
    eval 'r = ' + expr
    n.to_s == r.to_s.reverse
  end
end

puts answers
