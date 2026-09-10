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

**Corrected 2026-09-10.** The catalog was originally seeded from
Wikipedia because an earlier tick reported that `korcham.net` could
not be navigated to a founding-history page and that a guessed
history URL 404'd. The page does exist, and it is linked from
`korcham.net`'s own home page:

    https://www.korcham.net/nCham/Service/Kcci/appl/History.asp

Reaching it needs no guessing — only following the site's own links.
It carries KCCI's published chronology, which **confirms both facts
the Wikipedia seeding had asserted** (the 1884 Hanseong Chamber of
Commerce, and the Chambers of Commerce and Industry Act) and dates
the Act precisely, to **20 December 1952**. Every historical entry
now cites KCCI itself.

### Verify a citation by content, not by status code

Both cited hosts answer **HTTP 200 for paths that do not exist**:

| probe | status | what comes back |
|---|---|---|
| `korcham.net/nCham/Service/Kcci/appl/History.asp` | 200 | the chronology |
| `korcham.net/nCham/Service/Kcci/appl/HistoryX.asp` | **200** | `페이지를 찾을수 없습니다` (not found) |
| `law.go.kr/법령/상공회의소법` | 200 | the Act |
| `law.go.kr/법령/WRONG` | **200** | `국가법령정보센터 \| 오류페이지` |

So a status check cannot tell a real citation from one that points
at nothing — it passes either way. Check for a marker in the body.
`korcham.net` is EUC-KR and `law.go.kr` is UTF-8, so read the bytes
as sent before transcoding:

    curl -s -L https://www.korcham.net/nCham/Service/Kcci/appl/History.asp \
      | iconv -f EUC-KR -t UTF-8 | grep -c '1952. 12. 20'   # 1, not 0

    curl -s -L 'https://www.law.go.kr/법령/상공회의소법' \
      | grep -c '<title>상공회의소법</title>'                  # 1, not 0

Run the same two commands against the wrong paths in the table: both
still return 200, and both counts are 0. That difference is the
check.

### Statute entries

The two statute entries cite 국가법령정보센터 (`law.go.kr`), the
Ministry of Government Legislation's portal. Their numbers and dates
were cross-checked against that portal's own open API, which returned
the same values: the Act is 법률 제21152호 (promulgated 2025-12-02,
effective 2026-03-03) and the Enforcement Decree is 대통령령 제35803호
(promulgated and effective 2025-10-01), both administered by 산업통상부.

### What is deliberately not here

KCCI's chronology also lists chairman inaugurations. Those are the
personal names of office-holders and are **not** persisted here, per
`organization.edn`'s `:head-role-note`. `no-office-holder-is-named`
in the test suite pins that.


## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on KCCI's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `src/association_facts.kotoba` — the same catalog as Kotoba, so it
  reaches the Kotoba oracle, wasm and both native ISAs.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

15 entries across two topics (`:governance` 15, of which `:statute` 4),
each citing `korcham.net` or `law.go.kr`. `clojure -M:test` checks that
every entry carries a retrievable `https://` URL and a provenance naming
the domain it was read from, that ids are unique, that no office-holder
is named, that `data/datascript-tx.edn` still says what the catalog says,
and that the Kotoba port matches the `.cljc` field by field for all four
compile targets.


## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains KCCI's; this repo stores only citation metadata
(id/title/url/dates), not full text.
