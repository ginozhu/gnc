(function(){
	var app = angular.module('store', [ ]);
	app.controller('StoreController', function(){
		this.products = gems;
	});
	var gem = {
		name: 'Dodecahedron',
		price: 2.95,
		description: 'test Dodecahedron',
		canPurchase: true,
		soldOut: false
	}
	var gems = [
		{
			name: "Dodecahedron",
			price: 2.95,
			description: "test Dodecahedron",
			canPurchase: true,
		},
		{
			name: "Pentagonal Gem",
			price: 5.95,
			description: "test Pentagonal Gem",
			canPurchase: false,
		}
	];
})();
