class String
  def palindrome?
    self == self.reverse
  end
end

answer = (10..Float::INFINITY).lazy.select do |n|
  n.to_s(2).palindrome? && n.to_s(8).palindrome? && n.to_s(10).palindrome?
end.first

puts answer
