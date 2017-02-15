class String
  def palindrome?
    self == self.reverse
  end
end

from = 10
bases = [10, 2, 8]

answer = (from..Float::INFINITY).find do |n|
  bases.all? {|b| n.to_s(b).palindrome?}
end

puts answer
