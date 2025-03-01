package com.ecwid.apiclient.v3.rule.nullablepropertyrules

import com.ecwid.apiclient.v3.dto.subscriptions.result.FetchedSubscription
import com.ecwid.apiclient.v3.rule.NullablePropertyRule
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.AllowNullable

val fetchedSubscriptionsNullablePropertyRules: List<NullablePropertyRule<*, *>> = listOf(
	AllowNullable(FetchedSubscription::cancelled),
	AllowNullable(FetchedSubscription::createTimestamp),
	AllowNullable(FetchedSubscription::updateTimestamp),
	AllowNullable(FetchedSubscription::paymentMethod),

	AllowNullable(FetchedSubscription.PaymentMethod::creditCardMaskedNumber),
	AllowNullable(FetchedSubscription.PaymentMethod::creditCardBrand),

	AllowNullable(FetchedSubscription.OrderTemplate::id),
	AllowNullable(FetchedSubscription.OrderTemplate::email),
	AllowNullable(FetchedSubscription.OrderTemplate::additionalInfo),
	AllowNullable(FetchedSubscription.OrderTemplate::orderComments),
	AllowNullable(FetchedSubscription.OrderTemplate::paymentMethod),
	AllowNullable(FetchedSubscription.OrderTemplate::paymentModule),
	AllowNullable(FetchedSubscription.OrderTemplate::total),
	AllowNullable(FetchedSubscription.OrderTemplate::subtotal),
	AllowNullable(FetchedSubscription.OrderTemplate::usdTotal),
	AllowNullable(FetchedSubscription.OrderTemplate::tax),
	AllowNullable(FetchedSubscription.OrderTemplate::customerTaxExempt),
	AllowNullable(FetchedSubscription.OrderTemplate::customerTaxId),
	AllowNullable(FetchedSubscription.OrderTemplate::customerTaxIdValid),
	AllowNullable(FetchedSubscription.OrderTemplate::reversedTaxApplied),
	AllowNullable(FetchedSubscription.OrderTemplate::items),
	AllowNullable(FetchedSubscription.OrderTemplate::billingPerson),
	AllowNullable(FetchedSubscription.OrderTemplate::shippingPerson),
	AllowNullable(FetchedSubscription.OrderTemplate::shippingOption),
	AllowNullable(FetchedSubscription.OrderTemplate::handlingFee),
	AllowNullable(FetchedSubscription.OrderTemplate::pricesIncludeTax),


	AllowNullable(FetchedSubscription.AdditionalInfo::creditCard),
	AllowNullable(FetchedSubscription.AdditionalInfo::creditCardExpirationMonth),
	AllowNullable(FetchedSubscription.AdditionalInfo::creditCardExpirationYear),
	AllowNullable(FetchedSubscription.AdditionalInfo::googleCustomerId),
	AllowNullable(FetchedSubscription.AdditionalInfo::stripeCardId),
	AllowNullable(FetchedSubscription.AdditionalInfo::stripeCreditCardBrand),
	AllowNullable(FetchedSubscription.AdditionalInfo::stripeCreditCardLast4Digit),
	AllowNullable(FetchedSubscription.AdditionalInfo::stripeCustomerId),
	AllowNullable(FetchedSubscription.AdditionalInfo::stripeFingerprint),
	AllowNullable(FetchedSubscription.AdditionalInfo::stripeLiveMode),

	AllowNullable(FetchedSubscription.OrderItem::id),
	AllowNullable(FetchedSubscription.OrderItem::productId),
	AllowNullable(FetchedSubscription.OrderItem::categoryId),
	AllowNullable(FetchedSubscription.OrderItem::price),
	AllowNullable(FetchedSubscription.OrderItem::productPrice),
	AllowNullable(FetchedSubscription.OrderItem::shipping),
	AllowNullable(FetchedSubscription.OrderItem::tax),
	AllowNullable(FetchedSubscription.OrderItem::fixedShippingRate),
	AllowNullable(FetchedSubscription.OrderItem::sku),
	AllowNullable(FetchedSubscription.OrderItem::name),
	AllowNullable(FetchedSubscription.OrderItem::shortDescription),
	AllowNullable(FetchedSubscription.OrderItem::quantity),
	AllowNullable(FetchedSubscription.OrderItem::quantityInStock),
	AllowNullable(FetchedSubscription.OrderItem::weight),
	AllowNullable(FetchedSubscription.OrderItem::trackQuantity),
	AllowNullable(FetchedSubscription.OrderItem::fixedShippingRateOnly),
	AllowNullable(FetchedSubscription.OrderItem::digital),
	AllowNullable(FetchedSubscription.OrderItem::productAvailable),
	AllowNullable(FetchedSubscription.OrderItem::imageUrl),
	AllowNullable(FetchedSubscription.OrderItem::recurringChargeSettings),
	AllowNullable(FetchedSubscription.OrderItem::selectedOptions),
	AllowNullable(FetchedSubscription.OrderItem::taxes),
	AllowNullable(FetchedSubscription.OrderItem::dimensions),


	AllowNullable(FetchedSubscription.SelectedOptions::name),
	AllowNullable(FetchedSubscription.SelectedOptions::type),
	AllowNullable(FetchedSubscription.SelectedOptions::value),
	AllowNullable(FetchedSubscription.SelectedOptions::valuesArray),
	AllowNullable(FetchedSubscription.SelectedOptions::selections),

	AllowNullable(FetchedSubscription.Selections::selectionTitle),
	AllowNullable(FetchedSubscription.Selections::selectionModifier),
	AllowNullable(FetchedSubscription.Selections::selectionModifierType),


	AllowNullable(FetchedSubscription.Taxes::name),
	AllowNullable(FetchedSubscription.Taxes::value),
	AllowNullable(FetchedSubscription.Taxes::total),
	AllowNullable(FetchedSubscription.Taxes::taxOnDiscountedSubtotal),
	AllowNullable(FetchedSubscription.Taxes::taxOnShipping),
	AllowNullable(FetchedSubscription.Taxes::includeInPrice),

	AllowNullable(FetchedSubscription.Dimensions::length),
	AllowNullable(FetchedSubscription.Dimensions::width),
	AllowNullable(FetchedSubscription.Dimensions::height),

	AllowNullable(FetchedSubscription.PersonInfo::name),
	AllowNullable(FetchedSubscription.PersonInfo::companyName),
	AllowNullable(FetchedSubscription.PersonInfo::street),
	AllowNullable(FetchedSubscription.PersonInfo::city),
	AllowNullable(FetchedSubscription.PersonInfo::countryCode),
	AllowNullable(FetchedSubscription.PersonInfo::countryName),
	AllowNullable(FetchedSubscription.PersonInfo::postalCode),
	AllowNullable(FetchedSubscription.PersonInfo::stateOrProvinceCode),
	AllowNullable(FetchedSubscription.PersonInfo::stateOrProvinceName),
	AllowNullable(FetchedSubscription.PersonInfo::phone),

	AllowNullable(FetchedSubscription.ShippingOption::shippingMethodName),
	AllowNullable(FetchedSubscription.ShippingOption::shippingRate),

	AllowNullable(FetchedSubscription.HandlingFee::name),
	AllowNullable(FetchedSubscription.HandlingFee::value),
	AllowNullable(FetchedSubscription.HandlingFee::description),
)
