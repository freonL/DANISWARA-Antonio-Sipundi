Select 
	[name],
	sum(amount*price) as totalPrice,
	transactionDate

from [transaction]
group by transactionDate, [name]
having [name] = 'Ahmad'
order by transactionDate