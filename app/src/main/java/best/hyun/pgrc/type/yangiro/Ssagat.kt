package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Ssagat: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_ssagat)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_ssagat)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 86
    override val initLvMaxAtk: Int
        get() = 20
    override val initLvMaxDef: Int
        get() = 12
    override val initLvMaxSpd: Int
        get() = 11
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1567
    override val maxLvMaxAtk: Int
        get() = 380
    override val maxLvMaxDef: Int
        get() = 229
    override val maxLvMaxSpd: Int
        get() = 213
    override val initLvMinHp: Int
        get() = 68
    override val initLvMinAtk: Int
        get() = 17
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 9
    override val maxLvMinHp: Int
        get() = 1354
    override val maxLvMinAtk: Int
        get() = 341
    override val maxLvMinDef: Int
        get() = 191
    override val maxLvMinSpd: Int
        get() = 181
    override val minAllGrowth: Double
        get() = 4.907
    override val maxAllGrowth: Double
        get() = 5.614
}