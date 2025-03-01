package com.ecwid.apiclient.v3.rule.nullablepropertyrules

import com.ecwid.apiclient.v3.dto.cart.result.FetchedCart
import com.ecwid.apiclient.v3.rule.NullablePropertyRule
import com.ecwid.apiclient.v3.rule.NullablePropertyRule.IgnoreNullable

val fetchedCartNullablePropertyRules: List<NullablePropertyRule<*, *>> = listOf(
    IgnoreNullable(FetchedCart::acceptMarketing),
	IgnoreNullable(FetchedCart::additionalInfo),
	IgnoreNullable(FetchedCart::affiliateId),
	IgnoreNullable(FetchedCart::billingPerson),
	IgnoreNullable(FetchedCart::couponDiscount),
	IgnoreNullable(FetchedCart::createDate),
	IgnoreNullable(FetchedCart::createTimestamp),
	IgnoreNullable(FetchedCart::creditCardStatus),
	IgnoreNullable(FetchedCart::customerGroup),
	IgnoreNullable(FetchedCart::customerGroupId),
	IgnoreNullable(FetchedCart::customerId),
	IgnoreNullable(FetchedCart::customerTaxExempt),
	IgnoreNullable(FetchedCart::customerTaxId),
	IgnoreNullable(FetchedCart::customerTaxIdValid),
	IgnoreNullable(FetchedCart::discount),
	IgnoreNullable(FetchedCart::discountCoupon),
	IgnoreNullable(FetchedCart::discountInfo),
	IgnoreNullable(FetchedCart::email),
	IgnoreNullable(FetchedCart::externalTransactionId),
	IgnoreNullable(FetchedCart::globalReferer),
	IgnoreNullable(FetchedCart::handlingFee),
	IgnoreNullable(FetchedCart::hidden),
	IgnoreNullable(FetchedCart::ipAddress),
	IgnoreNullable(FetchedCart::items),
	IgnoreNullable(FetchedCart::membershipBasedDiscount),
	IgnoreNullable(FetchedCart::orderComments),
	IgnoreNullable(FetchedCart::paymentMessage),
	IgnoreNullable(FetchedCart::paymentMethod),
	IgnoreNullable(FetchedCart::paymentModule),
	IgnoreNullable(FetchedCart::paymentParams),
	IgnoreNullable(FetchedCart::recoveredOrderId),
	IgnoreNullable(FetchedCart::recoveredPublicUid),
	IgnoreNullable(FetchedCart::recoveryEmailSentTimestamp),
	IgnoreNullable(FetchedCart::refererUrl),
	IgnoreNullable(FetchedCart::reversedTaxApplied),
	IgnoreNullable(FetchedCart::shippingOption),
	IgnoreNullable(FetchedCart::shippingPerson),
	IgnoreNullable(FetchedCart::subtotal),
	IgnoreNullable(FetchedCart::tax),
	IgnoreNullable(FetchedCart::taxesOnShipping),
	IgnoreNullable(FetchedCart::total),
	IgnoreNullable(FetchedCart::totalAndMembershipBasedDiscount),
	IgnoreNullable(FetchedCart::trackingNumber),
	IgnoreNullable(FetchedCart::updateDate),
	IgnoreNullable(FetchedCart::updateTimestamp),
	IgnoreNullable(FetchedCart::usdTotal),
	IgnoreNullable(FetchedCart::utmData),
	IgnoreNullable(FetchedCart::volumeDiscount),
	IgnoreNullable(FetchedCart.CreditCardStatus::avsMessage),
	IgnoreNullable(FetchedCart.CreditCardStatus::cvvMessage),
	IgnoreNullable(FetchedCart.DiscountCouponCatalogLimit::categories),
	IgnoreNullable(FetchedCart.DiscountCouponCatalogLimit::products),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::applicationLimit),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::catalogLimit),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::code),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::creationDate),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::discount),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::discountType),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::expirationDate),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::launchDate),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::name),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::orderCount),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::status),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::totalLimit),
	IgnoreNullable(FetchedCart.DiscountCouponInfo::usesLimit),
	IgnoreNullable(FetchedCart.DiscountInfo::base),
	IgnoreNullable(FetchedCart.DiscountInfo::description),
	IgnoreNullable(FetchedCart.DiscountInfo::orderTotal),
	IgnoreNullable(FetchedCart.DiscountInfo::type),
	IgnoreNullable(FetchedCart.DiscountInfo::value),
	IgnoreNullable(FetchedCart.HandlingFeeInfo::description),
	IgnoreNullable(FetchedCart.HandlingFeeInfo::name),
	IgnoreNullable(FetchedCart.HandlingFeeInfo::value),
	IgnoreNullable(FetchedCart.OrderItem::categoryId),
	IgnoreNullable(FetchedCart.OrderItem::couponAmount),
	IgnoreNullable(FetchedCart.OrderItem::couponApplied),
	IgnoreNullable(FetchedCart.OrderItem::digital),
	IgnoreNullable(FetchedCart.OrderItem::dimensions),
	IgnoreNullable(FetchedCart.OrderItem::discounts),
	IgnoreNullable(FetchedCart.OrderItem::files),
	IgnoreNullable(FetchedCart.OrderItem::fixedShippingRate),
	IgnoreNullable(FetchedCart.OrderItem::fixedShippingRateOnly),
	IgnoreNullable(FetchedCart.OrderItem::id),
	IgnoreNullable(FetchedCart.OrderItem::imageUrl),
	IgnoreNullable(FetchedCart.OrderItem::isShippingRequired),
	IgnoreNullable(FetchedCart.OrderItem::name),
	IgnoreNullable(FetchedCart.OrderItem::price),
	IgnoreNullable(FetchedCart.OrderItem::productId),
	IgnoreNullable(FetchedCart.OrderItem::productPrice),
	IgnoreNullable(FetchedCart.OrderItem::quantity),
	IgnoreNullable(FetchedCart.OrderItem::quantityInStock),
	IgnoreNullable(FetchedCart.OrderItem::selectedOptions),
	IgnoreNullable(FetchedCart.OrderItem::shipping),
	IgnoreNullable(FetchedCart.OrderItem::shortDescription),
	IgnoreNullable(FetchedCart.OrderItem::sku),
	IgnoreNullable(FetchedCart.OrderItem::tax),
	IgnoreNullable(FetchedCart.OrderItem::taxes),
	IgnoreNullable(FetchedCart.OrderItem::trackQuantity),
	IgnoreNullable(FetchedCart.OrderItem::weight),
	IgnoreNullable(FetchedCart.OrderItem::externalReferenceId),
	IgnoreNullable(FetchedCart.OrderItemDiscountInfo::base),
	IgnoreNullable(FetchedCart.OrderItemDiscountInfo::orderTotal),
	IgnoreNullable(FetchedCart.OrderItemDiscountInfo::type),
	IgnoreNullable(FetchedCart.OrderItemDiscountInfo::value),
	IgnoreNullable(FetchedCart.OrderItemDiscounts::discountInfo),
	IgnoreNullable(FetchedCart.OrderItemDiscounts::total),
	IgnoreNullable(FetchedCart.OrderItemOptionFile::id),
	IgnoreNullable(FetchedCart.OrderItemOptionFile::name),
	IgnoreNullable(FetchedCart.OrderItemOptionFile::size),
	IgnoreNullable(FetchedCart.OrderItemOptionFile::url),
	IgnoreNullable(FetchedCart.OrderItemOption::files),
	IgnoreNullable(FetchedCart.OrderItemOption::name),
	IgnoreNullable(FetchedCart.OrderItemOption::selections),
	IgnoreNullable(FetchedCart.OrderItemOption::type),
	IgnoreNullable(FetchedCart.OrderItemOption::value),
	IgnoreNullable(FetchedCart.OrderItemOption::valuesArray),
	IgnoreNullable(FetchedCart.OrderItemProductFile::adminUrl),
	IgnoreNullable(FetchedCart.OrderItemProductFile::customerUrl),
	IgnoreNullable(FetchedCart.OrderItemProductFile::description),
	IgnoreNullable(FetchedCart.OrderItemProductFile::expire),
	IgnoreNullable(FetchedCart.OrderItemProductFile::maxDownloads),
	IgnoreNullable(FetchedCart.OrderItemProductFile::name),
	IgnoreNullable(FetchedCart.OrderItemProductFile::productFileId),
	IgnoreNullable(FetchedCart.OrderItemProductFile::remainingDownloads),
	IgnoreNullable(FetchedCart.OrderItemProductFile::size),
	IgnoreNullable(FetchedCart.OrderItemTax::includeInPrice),
	IgnoreNullable(FetchedCart.OrderItemTax::name),
	IgnoreNullable(FetchedCart.OrderItemTax::taxOnDiscountedSubtotal),
	IgnoreNullable(FetchedCart.OrderItemTax::taxOnShipping),
	IgnoreNullable(FetchedCart.OrderItemTax::total),
	IgnoreNullable(FetchedCart.OrderItemTax::value),
	IgnoreNullable(FetchedCart.PersonInfo::city),
	IgnoreNullable(FetchedCart.PersonInfo::companyName),
	IgnoreNullable(FetchedCart.PersonInfo::countryCode),
	IgnoreNullable(FetchedCart.PersonInfo::countryName),
	IgnoreNullable(FetchedCart.PersonInfo::firstName),
	IgnoreNullable(FetchedCart.PersonInfo::lastName),
	IgnoreNullable(FetchedCart.PersonInfo::name),
	IgnoreNullable(FetchedCart.PersonInfo::phone),
	IgnoreNullable(FetchedCart.PersonInfo::postalCode),
	IgnoreNullable(FetchedCart.PersonInfo::stateOrProvinceCode),
	IgnoreNullable(FetchedCart.PersonInfo::stateOrProvinceName),
	IgnoreNullable(FetchedCart.PersonInfo::street),
	IgnoreNullable(FetchedCart.ProductDimensions::height),
	IgnoreNullable(FetchedCart.ProductDimensions::length),
	IgnoreNullable(FetchedCart.ProductDimensions::width),
	IgnoreNullable(FetchedCart.SelectionInfo::selectionModifier),
	IgnoreNullable(FetchedCart.SelectionInfo::selectionModifierType),
	IgnoreNullable(FetchedCart.SelectionInfo::selectionTitle),
	IgnoreNullable(FetchedCart.ShippingOptionInfo::estimatedTransitTime),
	IgnoreNullable(FetchedCart.ShippingOptionInfo::isPickup),
	IgnoreNullable(FetchedCart.ShippingOptionInfo::pickupInstruction),
	IgnoreNullable(FetchedCart.ShippingOptionInfo::shippingCarrierName),
	IgnoreNullable(FetchedCart.ShippingOptionInfo::shippingMethodName),
	IgnoreNullable(FetchedCart.ShippingOptionInfo::shippingRate),
	IgnoreNullable(FetchedCart.TaxOnShipping::name),
	IgnoreNullable(FetchedCart.TaxOnShipping::total),
	IgnoreNullable(FetchedCart.TaxOnShipping::value),
	IgnoreNullable(FetchedCart.UtmData::campaign),
	IgnoreNullable(FetchedCart.UtmData::mcCid),
	IgnoreNullable(FetchedCart.UtmData::mcEid),
	IgnoreNullable(FetchedCart.UtmData::medium),
	IgnoreNullable(FetchedCart.UtmData::source)
)
