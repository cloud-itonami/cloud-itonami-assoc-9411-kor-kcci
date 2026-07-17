# cloud-itonami-assoc-9411-kor-kcci

Industry rule/history catalog for the **Korea Chamber of Commerce
and Industry** (KCCI, 대한상공회의소) — the FOURTEENTH entry aligned
to **ISIC 9411** (activities of business, employers, and professional
membership organizations), alongside
[`-9411-sau-fsc`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-sau-fsc)
(Saudi Arabia),
[`-9411-aut-wko`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-aut-wko)
(Austria),
[`-9411-irl-ibec`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-irl-ibec)
(Ireland),
[`-9411-nzl-businessnz`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nzl-businessnz)
(New Zealand),
[`-9411-cze-spcr`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-cze-spcr)
(Czech Republic),
[`-9411-ind-cii`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ind-cii)
(India),
[`-9411-zaf-busa`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-zaf-busa)
(South Africa),
[`-9411-bra-cni`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bra-cni)
(Brazil),
[`-9411-ken-kam`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ken-kam)
(Kenya),
[`-9411-can-chamber`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-can-chamber)
(Canada),
[`-9411-mex-coparmex`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-mex-coparmex)
(Mexico),
[`-9411-ita-confindustria`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ita-confindustria)
(Italy), and
[`-9411-nld-vnoncw`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nld-vnoncw)
(Netherlands). Part of the
[`cloud-itonami`](https://github.com/cloud-itonami) compliance-fact
family (ADR-2607141700, `cloud-itonami-compliance-fact-federation`,
in `com-junkawasaki/root`).

## Sourcing note

This repo fills South Korea's previously-open association-axis gap
(one of the 14-country gap list recorded at tick 148). South Korea
now has real, individually verified facts across all three axes:
country
([`cloud-itonami-iso3166-kor`](https://github.com/cloud-itonami/cloud-itonami-iso3166-kor)),
municipality
([`cloud-itonami-municipality-kor-seoul`](https://github.com/cloud-itonami/cloud-itonami-municipality-kor-seoul)),
and association (this repo).

`korcham.net`'s own domain uses an old-style ASP site structure that
could not be navigated to a specific founding-history page this tick
(the main page rendered but contained no historical content; a
guessed history-page URL 404'd). Both entries here were instead
directly WebFetch-verified against `en.wikipedia.org`'s own article,
independently corroborated by Wikidata (Q12592604)'s own "inception"
statement, which itself cites the Encyclopedia of Korean Culture
(한국민족문화대백과사전) as its source.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on KCCI's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

Both entries directly WebFetch-verified against `en.wikipedia.org`'s
own article: the 1884 founding of the Seoul (Hanseong) Chamber of
Commerce (KCCI's earliest predecessor), and the 1952 Chamber of
Commerce Act that made KCCI an official statutory body.

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains KCCI's; this repo stores only citation metadata
(id/title/url/dates), not full text.
