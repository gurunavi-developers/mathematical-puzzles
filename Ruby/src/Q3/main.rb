cards = Array.new(100, false)

(2..100).each do |n|
  cards.each_with_index do |card, index|
    cards[index] = !card if (index + 1) % n == 0
  end
end

cards.each_with_index do |card, index|
  puts index + 1 unless card
end
