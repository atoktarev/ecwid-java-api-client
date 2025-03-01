package com.ecwid.apiclient.v3.rule.nullablepropertyrules

import com.ecwid.apiclient.v3.dto.variation.result.FetchedVariation
import com.ecwid.apiclient.v3.rule.NullablePropertyRule
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.AllowNullable
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.IgnoreNullable

val fetchedVariationTypeNullablePropertyRules: List<NullablePropertyRule<*, *>> = listOf(
	IgnoreNullable(FetchedVariation::attributes),
	AllowNullable(FetchedVariation::borderInfo),
	IgnoreNullable(FetchedVariation::compareToPrice),
	AllowNullable(FetchedVariation::costPrice),
	AllowNullable(FetchedVariation::customsHsTariffCode),
	IgnoreNullable(FetchedVariation::defaultDisplayedPrice),
	IgnoreNullable(FetchedVariation::defaultDisplayedPriceFormatted),
	AllowNullable(FetchedVariation::dimensions),
	IgnoreNullable(FetchedVariation::hdThumbnailUrl),
	IgnoreNullable(FetchedVariation::imageUrl),
	AllowNullable(FetchedVariation::inStock),
	IgnoreNullable(FetchedVariation::isShippingRequired),
	IgnoreNullable(FetchedVariation::options),
	IgnoreNullable(FetchedVariation::originalImageUrl),
	IgnoreNullable(FetchedVariation::price),
	IgnoreNullable(FetchedVariation::quantity),
	IgnoreNullable(FetchedVariation::outOfStockVisibilityBehaviour),
	IgnoreNullable(FetchedVariation::sku),
	IgnoreNullable(FetchedVariation::smallThumbnailUrl),
	IgnoreNullable(FetchedVariation::thumbnailUrl),
	IgnoreNullable(FetchedVariation::unlimited),
	IgnoreNullable(FetchedVariation::warningLimit),
	AllowNullable(FetchedVariation::minPurchaseQuantity),
	AllowNullable(FetchedVariation::maxPurchaseQuantity),
	IgnoreNullable(FetchedVariation::weight),
	IgnoreNullable(FetchedVariation::wholesalePrices),
	AllowNullable(FetchedVariation::externalReferenceId),
	IgnoreNullable(FetchedVariation.AttributeValue::id),
	IgnoreNullable(FetchedVariation.AttributeValue::name),
	IgnoreNullable(FetchedVariation.AttributeValue::show),
	IgnoreNullable(FetchedVariation.AttributeValue::type),
	IgnoreNullable(FetchedVariation.AttributeValue::value),
	IgnoreNullable(FetchedVariation.AttributeValue::valueTranslated),
	AllowNullable(FetchedVariation.BorderInfo::homogeneity),
	AllowNullable(FetchedVariation.BorderInfo::dominatingColor),
	AllowNullable(FetchedVariation.Color::alpha),
	AllowNullable(FetchedVariation.Color::blue),
	AllowNullable(FetchedVariation.Color::green),
	AllowNullable(FetchedVariation.Color::red),
	IgnoreNullable(FetchedVariation.Option::name),
	IgnoreNullable(FetchedVariation.Option::nameTranslated),
	IgnoreNullable(FetchedVariation.Option::value),
	IgnoreNullable(FetchedVariation.Option::valueTranslated),
	IgnoreNullable(FetchedVariation::subscriptionSettings),
	IgnoreNullable(FetchedVariation.RecurringChargeSettings::signUpFee),
	IgnoreNullable(FetchedVariation.RecurringChargeSettings::signUpFeeFormatted),
	AllowNullable(FetchedVariation.RecurringChargeSettings::subscriptionPriceWithSignUpFee),
	IgnoreNullable(FetchedVariation.RecurringChargeSettings::subscriptionPriceWithSignUpFeeFormatted),
	IgnoreNullable(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkup),
	IgnoreNullable(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkupFormatted),
	IgnoreNullable(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkupPercent),
	IgnoreNullable(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkupPercentFormatted),
	IgnoreNullable(FetchedVariation.SubscriptionSettings::displayedOneTimePurchaseMarkupPercent),
	IgnoreNullable(FetchedVariation.SubscriptionSettings::displayedOneTimePurchaseMarkupPercentFormatted),
	AllowNullable(FetchedVariation.SubscriptionSettings::oneTimePurchasePrice),
	IgnoreNullable(FetchedVariation.SubscriptionSettings::oneTimePurchasePriceFormatted)
)
